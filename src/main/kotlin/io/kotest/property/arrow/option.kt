package io.kotest.property.arrow

import arrow.core.None
import arrow.core.Option
import arrow.core.Some
import arrow.core.some
import io.kotest.property.Arb
import io.kotest.property.Exhaustive
import io.kotest.property.arbitrary.constant
import io.kotest.property.arbitrary.map
import io.kotest.property.arbitrary.merge
import io.kotest.property.exhaustive.exhaustive

/**
 * Returns an Exhaustive that contains a None and a Some with the given value
 */
fun <A> Exhaustive.Companion.option(a: A) = exhaustive(listOf(None, Some(a)))

fun <A> Exhaustive.Companion.none() = exhaustive(listOf(None))

/**
 * Wraps each element generated by the given Arb in a Some.
 */
fun <A> Arb.Companion.some(arb: Arb<A>): Arb<Option<A>> = arb.map { it.some() }

fun <A> Arb.Companion.none(): Arb<Option<A>> = Arb.constant(None)

fun <A> Arb.Companion.option(arb: Arb<A>): Arb<Option<A>> = some(arb).merge(none())
