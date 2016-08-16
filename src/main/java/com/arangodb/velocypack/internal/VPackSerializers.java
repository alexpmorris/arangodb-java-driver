package com.arangodb.velocypack.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.arangodb.velocypack.VPackSerializer;
import com.arangodb.velocypack.Value;

/**
 * @author Mark - mark@arangodb.com
 *
 */
public class VPackSerializers {

	private VPackSerializers() {
		super();
	}

	public static VPackSerializer<String> STRING = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(String.class.cast(value)));
	public static VPackSerializer<Boolean> BOOLEAN = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Boolean.class.cast(value)));
	public static VPackSerializer<Integer> INTEGER = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Integer.class.cast(value)));
	public static VPackSerializer<Long> LONG = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Long.class.cast(value)));
	public static VPackSerializer<Short> SHORT = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Short.class.cast(value)));
	public static VPackSerializer<Double> DOUBLE = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Double.class.cast(value)));
	public static VPackSerializer<Float> FLOAT = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Float.class.cast(value)));
	public static VPackSerializer<BigInteger> BIG_INTEGER = (builder, attribute, value, context) -> builder
			.add(attribute, new Value(BigInteger.class.cast(value)));
	public static VPackSerializer<BigDecimal> BIG_DECIMAL = (builder, attribute, value, context) -> builder
			.add(attribute, new Value(BigDecimal.class.cast(value)));
	public static VPackSerializer<Number> NUMBER = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Double.class.cast(value)));
	public static VPackSerializer<Character> CHARACTER = (builder, attribute, value, context) -> builder.add(attribute,
		new Value(Character.class.cast(value)));

}
