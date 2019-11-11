/**
 * 
 */
package com.springsecurity.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author PRASADBolla
 *
 */
@Path("/productservice")
public interface ProductService {
	@GET
	@Path("/products")
 List<Product> getProducts();
	@POST
	@Path("/addProudc")
 long addProduct(Product product);
}
