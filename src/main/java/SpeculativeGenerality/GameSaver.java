package main.java.SpeculativeGenerality;

import java.io.ObjectOutputStream;

public class GameSaver implements IGameSaver {
    private ObjectOutputStream objectOutputStream;

    public GameSaver(ObjectOutputStream objectOutputStream) {
        this.objectOutputStream = objectOutputStream;
    }


    public void save(IGame theGame) {

    }
}
