package com.xworkz;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ply")
public class Player {

	@Id
	@GeneratedValue // (strategy = Generation.sequence) will generate auto id for primary key ,, auto,identity,sequence,table generators type
	@Column(name = "Player_id")
	private int ply_id;
	@Column(name = "Player_name")
	private String ply_name;
	@Column(name = "Player_game")
	private String ply_game;
	
	
	public int getPly_id() {
		return ply_id;
	}
	public void setPly_id(int ply_id) {
		this.ply_id = ply_id;
	}
	public String getPly_name() {
		return ply_name;
	}
	public void setPly_name(String ply_name) {
		this.ply_name = ply_name;
	}
	public String getPly_game() {
		return ply_game;
	}
	public void setPly_game(String ply_game) {
		this.ply_game = ply_game;
	}
	
	@Override
	public String toString() {
		return "Player [ply_id=" + ply_id + ", ply_name=" + ply_name + ", ply_game=" + ply_game + "]";
	}
	
	
}
