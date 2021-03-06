/*
 * Copyright (c) 2012-2013, Credit Suisse
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * Neither the name of JSR-354 nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package javax.money.provider.impl;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import javax.money.provider.MonetaryAmountProvider;

/**
 * Empty pseudo implementation for testing only.
 * @author Anatole Tresch
 *
 */
public class TestMonetaryAmountProvider implements MonetaryAmountProvider {

	@Override
	public Class<?> getNumberClass() {
		return String.class;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, Number number) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, byte value) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, short value) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, int value) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, long value) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, long major, long minor) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, float value) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount get(CurrencyUnit currency, double value) {
		// empty implementation
		return null;
	}

	@Override
	public MonetaryAmount zero(CurrencyUnit currency) {
		// empty implementation
		return null;
	}

}
