package io.github.some_example_name;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


/** First screen of the application. Displayed after the application is created. */
public class FirstScreen implements Screen {

    private OrthographicCamera camera;
    private Viewport viewport;
    
    @Override
    public void show() {
        // Prepare your screen here.
    camera = new OrthographicCamera();
    viewport = new FitViewport(1, 600, camera); // Game world size
    viewport.apply();

    camera.position.set(800 / 2f, 600 / 2f, 0);
    camera.update();
        
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
        viewport.update(600, 500);
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
    }
}