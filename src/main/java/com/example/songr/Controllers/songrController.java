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

import java.util.List;

@Controller
public class songrController {

    @Autowired
    AlbumRepo albumRepo;
    @Autowired
    SongsRepo songsRepo;
//    @GetMapping("/")
//    public String getSplashPage(){
//
//    }

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "HelloWorld.html";
    }

    @ResponseBody
    @GetMapping("/capitalize/{word}")
    public String capitalizeWord(@PathVariable("word") String word){
        String cappedWord = word.toUpperCase();
        return cappedWord;
    }

    @GetMapping("/albums")
    public String getAlbums(Model m){
        m.addAttribute("albumRepo", albumRepo.findAll());
        return "AlbumView.html";
    }


    @PostMapping("/addalbum")
    public RedirectView addAlbum(@ModelAttribute Album album, Model m){
    m.addAttribute("album", album);
    albumRepo.save(album);
    return new RedirectView("/albums");
    }


    @GetMapping("/album/{id}")
    public String getOneAlbum(Model model, @PathVariable(value = "id") Integer id){
        Album album = albumRepo.findById(id).get();
        List<Song> songs = songsRepo.findAllByAlbumId(id);
        model.addAttribute("list", songs);
        model.addAttribute("album", album);
        return "songsInAlbum.html";

    }


//    @PostMapping("/album/{id}")
//    public RedirectView getSpecificAlbum(@ModelAttribute Song song, @PathVariable(value = "id") Integer id , Model model){
//        Album album = albumRepo.findById(id).get();
//        model.addAttribute("album", album);
//        model.addAttribute("songList", album.getSongs());
//        songsRepo.save(song);
//
//        return new RedirectView("/albums");
//
//    }

}
