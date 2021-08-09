package com.example.songr.Repositories;


import com.example.songr.Models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepo extends CrudRepository<Album,Integer> {
}
