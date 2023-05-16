package com.iamstevol.media.exception;

import java.math.BigInteger;

@SuppressWarnings("serial")
public class PlaylistNotFoundException extends RuntimeException{

    public PlaylistNotFoundException(final BigInteger id) {
        super(String.format("Playlist with id '%s' could not be found", id));
    }
}
