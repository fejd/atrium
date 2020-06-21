//---------------------------------------------------
//  Generated content, modify: 
//  logic/atrium-logic-common/build.gradle 
//  if necessary - enjoy the day 🙂 
//---------------------------------------------------

package ch.tutteli.atrium.logic

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.domain.creating.changers.ExtractedFeaturePostStep

fun AssertionContainer<Collection<*>>.isEmpty(): Assertion = _collectionImpl.isEmpty(this)
fun AssertionContainer<Collection<*>>.isNotEmpty(): Assertion = _collectionImpl.isNotEmpty(this)
fun <T : Collection<*>> AssertionContainer<T>.size(): ExtractedFeaturePostStep<T, Int> = _collectionImpl.size(this)