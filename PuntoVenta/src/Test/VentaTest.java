package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import PuntoVenta.Producto;
import PuntoVenta.Venta;
import PuntoVenta.LineaDetalle;

class VentaTest {

	@Test
	void test() {
		Producto p1 = new Producto("xxx", "YYY", 200);
		Producto p2 = new Producto("yyy", "ZZZ", 300);
		
		LineaDetalle ld1 = new LineaDetalle(1, p1);
		LineaDetalle ld2 = new LineaDetalle(1, p2);
		
	Venta venta = new Venta();
		
		venta.agregarLineaDetalle(ld1);
		venta.agregarLineaDetalle(ld2);
	
		assertEquals(500,venta.calcularTotal());
		
		//CASO 2
		LineaDetalle ld3 = new LineaDetalle(10,p1);
		
		Venta venta2 = new Venta();
		venta2.agregarLineaDetalle(ld3);
			
		assertEquals(2000,venta2.calcularTotal());
		
		//CASO 3 FALLIDO
		LineaDetalle ld4 = new LineaDetalle(10,p2);
				
		Venta venta3 = new Venta();
		venta3.agregarLineaDetalle(ld4);
					
		assertEquals(3001,venta3.calcularTotal());	
	}

}