package com.zmh.facade;

public class HomeTheaterFacade {
	
	private TheaterLight theaterLight;
	private DVDPlayer dvdPlayer;
	private Popcorn popcorn;
	private Projector projector;
	private Screen screen;
	private Stereo stereo;
	
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.dvdPlayer = DVDPlayer.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.stereo = Stereo.getInstance();
	}

	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		stereo.on();
		projector.on();
		dvdPlayer.on();
		theaterLight.dim();
	}

	public void play() {
		dvdPlayer.play();
	}
	
	public void pause() {
		dvdPlayer.pause();
	}
	
	public void end() {
		popcorn.off();
		screen.up();
		stereo.off();
		projector.off();
		dvdPlayer.off();
		theaterLight.bright();
	}
	
	public static void main(String[] args) {
		
	}
}
