package net.java.javamoney.ri.ext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.money.ext.RegionType;

import org.junit.Test;

public class SingletonRegionTypeTest {

	@Test
	public void testHashCode() {
		RegionType t1 = SingletonRegionType.of("TypeA");
		RegionType t2 = SingletonRegionType.of("TypeB");
		assertNotSame(t1.hashCode(), t2.hashCode());
	}

	@Test
	public void testOf() {
		RegionType t1 = SingletonRegionType.of("");
		RegionType t2 = SingletonRegionType.of("1");
		RegionType t3 = SingletonRegionType.of("1");
		RegionType t4 = SingletonRegionType.of("2");
		assertTrue(t2 == t3);
		assertFalse(t1 == t2);
		assertFalse(t3 == t4);
	}

	@Test
	public void testGetTypes() {
		SingletonRegionType.of("");
		SingletonRegionType.of("1");
		SingletonRegionType.of("1");
		SingletonRegionType.of("2");
		Enumeration<RegionType> types = SingletonRegionType.getTypes();
		int count = 0;
		Set<String> ids = new HashSet<String>();
		while (types.hasMoreElements()) {
			RegionType type = (RegionType) types.nextElement();
			ids.add(type.getId());
			count++;
		}
		assertTrue(ids.contains(""));
		assertTrue(ids.contains("1"));
		assertTrue(ids.contains("2"));
		assertFalse(ids.contains("3"));
	}

	@Test
	public void testSingletonRegionType() {
		new SingletonRegionType("abc");
	}

	@Test
	public void testGetId() {
		SingletonRegionType t = new SingletonRegionType("abc");
		"abc".equals(t.getId());
	}

	@Test
	public void testEqualsObject() {
		RegionType t1 = new SingletonRegionType("1");
		RegionType t2 = SingletonRegionType.of("2");
		assertNotSame(t1, t2);
		t1 = new SingletonRegionType("2");
		assertEquals(t1, t2);
	}

	@Test
	public void testToString() {
		RegionType t1 = new SingletonRegionType("idid");
		String s = t1.toString();
		assertEquals("RegionType [id=idid, class=net.java.javamoney.ri.ext.SingletonRegionType]", s);
	}

	@Test
	public void testCompareTo() {
		RegionType t1 = new SingletonRegionType("aa");
		RegionType t2 = SingletonRegionType.of("aa");
		assertTrue(((Comparable<RegionType>)t1).compareTo(t2)==0);
		assertTrue(((Comparable<RegionType>)t2).compareTo(t1)==0);
	}
}
