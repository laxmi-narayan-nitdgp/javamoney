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
package javax.money;

/**
 * The interface to be implemented for rounding support.
 * 
 * @author Anatole Tresch
 */
public interface RoundingSupport {

	/**
	 * Access a {@link Rounding} using its identifier.
	 * 
	 * @param id
	 *            The id that identifies the rounding.
	 * @return The currency found, never null.
	 * @throws IllegalArgumentException
	 *             if the required rounding is not defined.
	 */
	public Rounding getRounding(String id);

	/**
	 * Checks if a rounding is defined using its identifier.
	 * 
	 * @param id
	 *            The rounding id, e.g. 'HALF-UP'.
	 * @param code
	 *            The code that, together with the namespace identifies the
	 *            currency.
	 * @return true, if the currency is defined.
	 */
	public boolean isRoundingDefined(String id);

	/**
	 * Access the {@link Rounding} for a given {@link CurrencyUnit}.
	 * 
	 * @param currency
	 *            the currency instance. not null.
	 * @return the {@link Rounding}. If no explicit {@link Rounding} is defined,
	 *         it should be created/registered based on
	 *         {@link CurrencyUnit#getDefaultFractionDigits()}.
	 */
	public Rounding getRounding(CurrencyUnit currency);

	/**
	 * Access the {@link Rounding} for a given {@link CurrencyUnit} and
	 * timestamp.
	 * 
	 * @param currency
	 *            the currency instance. not null.
	 * @param timestamp
	 *            the target timestamp for the {@link Rounding}, or -1 for the
	 *            current UTC time.
	 * @return the {@link Rounding}. If no explicit {@link Rounding} is defined,
	 *         it should be created/registered based on
	 *         {@link CurrencyUnit#getDefaultFractionDigits()}.
	 */
	public Rounding getRounding(CurrencyUnit currency, long timestamp);

	/**
	 * Allow to access all rounding identifiers currently available.
	 * {@link Rounding} can be accessed by calling {@link #getRounding(String)}.
	 * 
	 * @return the identifiers of all currently defined roundings.
	 */
	public String[] getRoundingIds();

}
