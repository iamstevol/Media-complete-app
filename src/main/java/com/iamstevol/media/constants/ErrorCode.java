package com.iamstevol.media.constants;

public enum ErrorCode {
    PLAYLIST_NOT_FOUND(1001),
    SONG_NOT_FOUND(1002);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }
}
