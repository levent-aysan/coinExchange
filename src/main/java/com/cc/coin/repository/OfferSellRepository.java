package com.cc.coin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cc.coin.entity.OfferSell;

@Repository
public interface OfferSellRepository extends JpaRepository<OfferSell, Integer>{


}

