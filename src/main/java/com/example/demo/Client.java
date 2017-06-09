package com.example.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;


public class Client {

	private static final String URL = "https://www.openfood.ch/api/v3/products";
	private static final String URL2 = "http://localhost:8080/products";
	
	public static void main(String[] args) {
		get();
	}
	
	public static void get(){
		try {
			URL url = new URL(URL2);
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "application/json");
			connection.addRequestProperty("Authorization", "Token token=65ec1fade7ae138f1c2ffba0385c4c28");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String response = null;
			
			if ((response = in.readLine()) != null) {
				System.out.println("succes");
	   		}
				
			in.close();
	  	} 
		catch (Exception e) {
			System.out.println("erreur");
			System.out.println(e);
        }	
		
	}
	
	public static void post(){
		String string = "";
		try {
 
			// Step1: Let's 1st read file from fileSystem
			// Change CrunchifyJSON.txt path here
			InputStream crunchifyInputStream = new FileInputStream("File/products.txt");
			InputStreamReader crunchifyReader = new InputStreamReader(crunchifyInputStream);
			BufferedReader br = new BufferedReader(crunchifyReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
 
			JSONObject jsonObject = new JSONObject(string);
			System.out.println(jsonObject);
 
			// Step2: Now pass JSON File Data to REST Service
			try {
				URL url = new URL(URL);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				connection.addRequestProperty("Authorization", "Token token=65ec1fade7ae138f1c2ffba0385c4c28");
				connection.setRequestMethod("POST");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();
 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 
				String response = null;
				while ((response = in.readLine()) != null) {
					System.out.println("\n REST Service Invoked Successfully..");
					System.out.println("\n " + response);
				}
				System.out.println("\nCrunchify REST Service Invoked Successfully..");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling Crunchify REST Service");
				System.out.println(e);
			}
 
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void put(){
		String string = "";
		try {
 
			InputStream crunchifyInputStream = new FileInputStream("Files/products.txt");
			InputStreamReader crunchifyReader = new InputStreamReader(crunchifyInputStream);
			BufferedReader br = new BufferedReader(crunchifyReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
 
			JSONObject jsonObject = new JSONObject(string);
			System.out.println(jsonObject);
 
			// Step2: Now pass JSON File Data to REST Service
			try {
				URL url = new URL(URL.concat("/58dcec64488dcb28fc56915c"));
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				connection.addRequestProperty("Authorization", "Token token=65ec1fade7ae138f1c2ffba0385c4c28");
				connection.setRequestMethod("PUT");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();
 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 
				String response = null;
				while ((response = in.readLine()) != null) {
					System.out.println("\n REST Service Invoked Successfully..");
					System.out.println("\n " + response);
				}
				System.out.println("\nCrunchify REST Service Invoked Successfully..");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling Crunchify REST Service");
				System.out.println(e);
			}
 
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(){
		String string = "";
		try {
 
			// Step2: Now pass JSON File Data to REST Service
			try {
				URL url = new URL(URL.concat("/58dcec64488dcb28fc56915c"));
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("DELETE");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 
				String response = null;
				while ((response = in.readLine()) != null) {
					System.out.println("\n REST Service Invoked Successfully..");
					System.out.println("\n " + response);
				}
				System.out.println("\nCrunchify REST Service Invoked Successfully..");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling Crunchify REST Service");
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
