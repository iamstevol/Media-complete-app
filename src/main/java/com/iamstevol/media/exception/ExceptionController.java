package com.iamstevol.media.exception;

import com.iamstevol.media.constants.ErrorCode;
import com.iamstevol.media.dtos.response.ResponseStatusError;
import com.iamstevol.media.model.Playlist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionController {

    public ResponseEntity<?> playlistNotFound(PlaylistNotFoundException ex) {
        return  ResponseEntity.badRequest().body(new ResponseStatusError(ErrorCode.PLAYLIST_NOT_FOUND.code(), ex.getMessage()));
    }

    public ResponseEntity<?> songNotFound(SongNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ResponseStatusError(ErrorCode.SONG_NOT_FOUND.code(), ex.getMessage()));
    }
}
