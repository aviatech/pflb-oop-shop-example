package exception;

import items.camera.Camera;

public class BrokenCameraException extends RuntimeException {

    public BrokenCameraException(Camera camera) {
        super(String.format("%s camera is broken!", camera.getName()));
    }

}
