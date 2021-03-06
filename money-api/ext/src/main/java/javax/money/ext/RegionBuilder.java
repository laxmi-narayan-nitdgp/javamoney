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
package javax.money.ext;

import java.util.Set;

/**
 * Regions can be used to segregate or access artifacts (e.g. currencies) either
 * based on geographical, or commercial aspects (e.g. legal units).
 * 
 * @see <a href="http://unstats.un.org/unsd/methods/m49/m49regin.htm">UN M.49:
 *      UN Statistics Division Country or area & region codes</a>
 * 
 * @author Anatole Tresch
 */
public interface RegionBuilder {

	/**
	 * Access the region's identifier. The identifier is unique in combination
	 * with the region type.
	 * 
	 * @return the region's type, never {@code null}.
	 */
	public String getId();

	/**
	 * Sets the given {@link RegionType} instance's identifier for this builder.
	 * 
	 * @param type
	 *            the {@link RegionType} instance.s identifier, not {@code null}
	 *            .
	 * @return this builder
	 */
	public RegionBuilder setId(String id);

	/**
	 * Get the region's type.
	 * 
	 * @return the region's type, never {@code null}.
	 */
	public RegionType getRegionType();

	/**
	 * Sets the given {@link RegionType} instance for this builder.
	 * 
	 * @param type
	 *            the {@link RegionType} instance to be used, not {@code null}.
	 * @return this builder
	 */
	public RegionBuilder setRegionType(RegionType type);

	/**
	 * access the child regions of this region.
	 * 
	 * @return the child regions, never {@code null}.
	 */
	public Set<Region> getChildRegions();

	/**
	 * Adds the given {@link Region} instances as child to this builder.
	 * 
	 * @param regions
	 *            the {@link Region} instance to be added, never {@code null}.
	 * @return this builder
	 */
	public RegionBuilder addChildRegions(Region... regions);

	/**
	 * Removes the given {@link Region} instances as child to this builder.
	 * 
	 * @param regions
	 *            the {@link Region} instance to be added, never {@code null}.
	 * @return this builder
	 */
	public RegionBuilder removeChildRegions(Region... regions);

	/**
	 * Removes all child {@link Region} from this builder.
	 */
	public void clearChildren();

	/**
	 * Access the parent region of the give region.
	 * 
	 * @return the parent region, or {@code null} if this region is a root
	 *         region.
	 */
	public Region getParentRegion();

	/**
	 * Sets the parent {@link Region} of the {@link Region} to be built.
	 * 
	 * @param region
	 *            the parent {@link Region}, or {@code null}.
	 * @return this builder
	 */
	public RegionBuilder setParentRegion(Region region);

	/**
	 * Allows to check if the builder can create an item to be built.
	 * 
	 * @return true, if {@link #build()} succeeds.
	 */
	public boolean isBuildable();

	/**
	 * Creates the unmodificale instance of {@link Region} using the setting of
	 * this {@link RegionBuilder}.
	 * 
	 * @throws IllegalStateException
	 *             when the {@link Region} can not be built (
	 *             {@link #isBuildable()}==false.
	 * @return an according {@link Region} instance, never {@code null}.
	 */
	public Region build();

}
