package com.example.watchgallery;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



    @Entity
	class Watch{
		
		private @Id @GeneratedValue Long id;
		private String name;
		private String brand;

		Watch(){}

		Watch(String name,String brand){
			this.name= name;
			this.brand=brand;
		}

		public Long getId(){
			return this.id;
		}
		public void setId(Long id){
			this.id =id;
		}

		public String getName(){
			return this.name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getBrand(){
			return this.brand;
		}
		public void setBrand(String brand){
			this.brand=brand;
		}


	}//end class watch
