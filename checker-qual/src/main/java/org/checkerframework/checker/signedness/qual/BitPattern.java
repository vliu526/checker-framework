package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value is not an arithmetic quantity, but is manipulated as a pattern of bits.
 *
 * <p>Examples include:
 *
 * <ul>
 *   <li>The return value of {@code Double.doubleToLongBits()}
 *   <li>A value used as a bitset
 * </ul>
 *
 * <p>All bitwise operators ({@code &}, {@code |}, {@code ^}, {@code ~}) and shifts ({@code <<},
 * {@code >>}, {@code >>>}) are permitted on {@code @BitPattern} values. All arithmetic operators
 * ({@code +}, {@code -}, {@code *}, {@code /}, {@code %}, {@code ++}, {@code --}) are forbidden.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
