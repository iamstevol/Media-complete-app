package com.iamstevol.media.service;

import com.iamstevol.media.model.Playlist;

import java.math.BigInteger;

public interface PlaylistService {

    Iterable<Playlist> getAllPlaylists();

    void getSongs(BigInteger playlistId);
}
