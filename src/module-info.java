module guia_movil.sai {
	exports ec.com.sai.main;
	exports ec.com.sai.utilities;
	exports ec.com.sai.controllers;
	exports ec.com.sai.model;	

	requires transitive com.jfoenix;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	requires org.controlsfx.controls;
	requires lombok;
	requires javafx.web;
	requires transitive com.gluonhq.maps;
	requires com.gluonhq.attach.storage;
	requires com.gluonhq.attach.util;
	
	
	opens ec.com.sai.controllers to javafx.fxml;
//	opens javafx.controls to com.jfoenix;
	
}