package com.example.watchgallery;

import org.springframework.data.jpa.repository.JpaRepository;

interface WatchRepository extends JpaRepository<Watch,Long>{

	}//end interface