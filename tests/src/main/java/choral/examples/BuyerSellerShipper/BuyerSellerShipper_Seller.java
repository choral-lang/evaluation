package choral.examples.BuyerSellerShipper;

import choral.channels.SymChannel_A;
import choral.lang.Unit;
import choral.annotations.Choreography;
import choral.examples.BuyerSellerShipperUtils.Price;
import choral.examples.BuyerSellerShipperUtils.Catalogue;

@Choreography( role = "Seller", name = "BuyerSellerShipper" )
class BuyerSellerShipper_Seller {
	SymChannel_A < Object > c;

	BuyerSellerShipper_Seller( SymChannel_A < Object > c, Unit cb ) {
		this( c );
	}

	BuyerSellerShipper_Seller( SymChannel_A < Object > c ) {
		this.c = c;
	}

	void run( Catalogue catalogue, Unit customer ) {
		run( catalogue );
	}

	void run( Catalogue catalogue ) {
		String title = c.< String >com( Unit.id );
		if( catalogue.includes( title ) ){
			c.< EnumBoolean >select( EnumBoolean.True );
			c.< Price >com( catalogue.quote( title ) );
			{
				switch( c.< EnumBoolean >select( Unit.id ) ){
					case True -> {
						catalogue.ship( title ).to( c.< String >com( Unit.id ) );
					}
					default -> {
						throw new RuntimeException( "Received unexpected label from select operation" );
					}
					case False -> {

					}
				}
			}
		} else {
			c.< EnumBoolean >select( EnumBoolean.False );
		}
	}

}
