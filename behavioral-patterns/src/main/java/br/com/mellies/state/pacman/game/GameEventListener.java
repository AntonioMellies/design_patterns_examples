package br.com.mellies.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
