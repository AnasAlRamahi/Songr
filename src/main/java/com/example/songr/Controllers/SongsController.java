package com.example.songr.Controllers;

import com.example.songr.Models.Album;
import com.example.songr.Models.Song;
import com.example.songr.Repositories.AlbumRepo;
import com.example.songr.Repositories.SongsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongsController {

    @Autowired
    SongsRepo songsRepo;
    @Autowired
    AlbumRepo albumRepo;


    @GetMapping("/songs")
    public String getSongs(Model m){
        m.addAttribute("songsRepo",songsRepo.findAll());
        return "songView.html";
    }

    @PostMapping("/addsong")
    public RedirectView addSong(Song song, Model model, Integer albumId){
        Album album = albumRepo.findById(albumId).get();
        model.addAttribute("song", song);
//        model.addAttribute("album", album);
        Song newSong = new Song(song.getTitle(), song.getLength(), album);
        songsRepo.save(newSong);
        return new RedirectView("/album/" + albumId);
    }

}
