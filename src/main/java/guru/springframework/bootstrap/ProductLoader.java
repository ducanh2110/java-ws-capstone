package guru.springframework.bootstrap;

import guru.springframework.domain.liliaceae;
import guru.springframework.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    	liliaceae shirt = new liliaceae();
        shirt.setTemperature(25.08f);
      
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        liliaceae mug = new liliaceae();
        mug.setTemperature(35.08f);
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());
    }
}
