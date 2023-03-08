package choral.examples.BiPair;

import choral.lang.Unit;
import choral.annotations.Choreography;

@Choreography( role = "A", name = "BiPair" )
public class BiPair_A< L, R > {
	private L left;

	public BiPair_A( L left, Unit right ) {
		this( left );
	}

	public BiPair_A( L left ) {
		this.left = left;
	}

	public L left() {
		return this.left;
	}

	public Unit right() {
		return Unit.id;
	}

}
