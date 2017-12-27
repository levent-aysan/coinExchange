package com.cc.coin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cc.coin.entity.OfferBuy;

@Repository
public interface OfferBuyRepository extends JpaRepository<OfferBuy, Integer>{



}

