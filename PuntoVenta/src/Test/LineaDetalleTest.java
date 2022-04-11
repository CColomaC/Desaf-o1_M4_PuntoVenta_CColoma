package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import PuntoVenta.Producto;
import PuntoVenta.LineaDetalle;

class LineaDetalleTest {

	@Test
	void test() {
		Producto p1 = new Producto();
		p1.setPrecio(200);
		
		Producto p2 = new Producto();
		p2.setPrecio(300);
		
		LineaDetalle ld = new LineaDetalle();
		ld.setCantidad(2);
		ld.setProducto(p1);
		
		assertEquals(400, ld.calcularSubtotal());
		
		//segundo caso
		LineaDetalle ld2 = new LineaDetalle();
		ld2.setCantidad(1);
		ld2.setProducto(p2);
		
		assertEquals(300, ld.calcularSubtotal());
		
		//fallido
		LineaDetalle ld3 = new LineaDetalle();
		ld3.setCantidad(3);
		ld3.setProducto(p1);
		
		assertEquals(299, ld.calcularSubtotal());
	}

}
