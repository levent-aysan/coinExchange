package com.cc.coin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cc.coin.entity.OfferBuy;
import com.cc.coin.repository.OfferBuyRepository;

@Service
public class OfferBuyService {

	@Autowired
	OfferBuyRepository offerbuyrep;

	public OfferBuy registerOfferBuy(OfferBuy ob) {

		return offerbuyrep.save(ob);
	}

	public List<OfferBuy> findAll() {
		List<OfferBuy> lb = offerbuyrep.findAll();
		return lb;

	}

}
