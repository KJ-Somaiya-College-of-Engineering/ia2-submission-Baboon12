package in.com.ia.msd.productcatalogue;

import com.google.inject.Guice;
import com.google.inject.Injector;

import in.com.ia.msd.productcatalogue.configuration.ProductServiceConfiguration;
import in.com.ia.msd.productcatalogue.healthchecks.BasicHealthCheck;
import in.com.ia.msd.productcatalogue.resources.ProductResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ProductServiceApplication extends Application<ProductServiceConfiguration> {
    public static void main(String[] args) throws Exception {
        new ProductServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "product-list-service";
    }

    @Override
    public void initialize(Bootstrap<ProductServiceConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ProductServiceConfiguration config,
                    Environment environment) {
        final BasicHealthCheck healthCheck = new BasicHealthCheck(config.getVersion());
        environment.healthChecks().register("template", healthCheck);

        Injector injector = Guice.createInjector();
        environment.jersey().register(injector.getInstance(ProductResource.class));
    }
}