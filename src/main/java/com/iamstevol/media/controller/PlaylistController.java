package com.iamstevol.media.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RequestMapping("/playlist")
public class PlaylistController {

    @GetMapping("/")
    public String fetchAllPlaylists(Model model) {
        model.addAttribute("playlists", Arrays.asList(new Playlist()));

        // template `playlists` will be rendered using data from `Model`
        return "index";
    }

    @GetMapping("/usingModelAndView")
    public ModelAndView fetchAllPlaylist() {

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("playlists", new Playlist());

        // template `playlists` will be rendered using data from attributes
        return new ModelAndView("index", attributes);
    }

    @PostMapping("/usingModelAndView")
    public ModelAndView createPlaylist(@RequestBody Playlist playlist) {

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("playlists", playlist);

        // template `playlists` will be rendered using data from attributes
        return new ModelAndView("index", attributes);
    }

    @GetMapping("/usingResponseBody")
    public @ResponseBody Playlist fetchAllPlaylists() {
        return new Playlist();
    }

    @GetMapping("/usingRequestParamAndResponseBody")
    public @ResponseBody Playlist fetchAllPlaylists(@RequestParam String name) {
        Playlist playlist = new Playlist();
        playlist.setName(name);
        return playlist;
    }
}

@lombok.Data // for generating getter-setter-toString-hashcode-equals methods
class Playlist {

    private long id = 1;
    private String name = "guitar";
    private List<Song> songs = Arrays.asList(new Song());
    private Date createdOn = new Date();

}

@lombok.Data // for generating getter-setter-toString-hashcode-equals methods
class Song {

    private long id = 2;
    private String name = "guitar song";
    private String coverUrl = "https://i.ytimg.com/vi/iIjSS_MbCGg/hqdefault.jpg";
    private Date createdOn = new Date();

}
