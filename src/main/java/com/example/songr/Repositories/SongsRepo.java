package com.example.songr.Repositories;

import com.example.songr.Models.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SongsRepo extends CrudRepository<Song, Integer> {
    List<Song> findAllByAlbumId(Integer id);
}
