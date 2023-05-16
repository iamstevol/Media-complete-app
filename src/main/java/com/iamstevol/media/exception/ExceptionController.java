package com.iamstevol.media.exception;

import com.iamstevol.media.model.Playlist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionController {

    public ResponseEntity<?> playlistNotFound(PlaylistNotFoundException ex) {

    }
}
