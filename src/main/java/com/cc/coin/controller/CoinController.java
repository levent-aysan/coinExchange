package com.cc.coin.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.coin.entity.OfferBuy;
import com.cc.coin.entity.OfferSell;
import com.cc.coin.entity.User;
import com.cc.coin.service.OfferBuyService;
import com.cc.coin.service.OfferSellService;

@RestController
@RequestMapping("coin")
public class CoinController {

	@Autowired
	OfferBuyService offerbuyservice;
	@Autowired
	OfferSellService offersellservice;
  

    @RequestMapping(value ="/buy",method = RequestMethod.GET)
    public List<OfferBuy> OfferBuys() {
    	return offerbuyservice.findAll();
    }
         
    @RequestMapping(value ="/sell",method = RequestMethod.GET)
    public List<OfferSell> OfferSells() {
    	return offersellservice.findAll();
    }        
}
