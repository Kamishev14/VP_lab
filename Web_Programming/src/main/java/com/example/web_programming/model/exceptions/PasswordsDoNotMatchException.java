package com.example.web_programming.model.exceptions;

import java.awt.image.renderable.RenderableImageOp;

public class PasswordsDoNotMatchException extends RuntimeException {
    public PasswordsDoNotMatchException() {
        super("Passwords do not MATCH!");
    }
}
