package com.cc.coin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cc.coin.entity.OfferSell;
import com.cc.coin.repository.OfferSellRepository;

@Service
public class OfferSellService {

	@Autowired
	OfferSellRepository offersellrep;

	public OfferSell registerOfferBuy(OfferSell os) {
		return offersellrep.save(os);
	}

	public List<OfferSell> findAll() {
		List<OfferSell> lb = offersellrep.findAll();
		return lb;

	}

}
