//TODO remove file with 1.0.0
@file:Suppress("DEPRECATION")
package ch.tutteli.atrium.domain.robstoll.lib.creating

import ch.tutteli.atrium.api.fluent.en_GB.toBe
import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.domain.creating.changers.ExtractedFeaturePostStep

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun <K, V, T : Map.Entry<K, V>> _isKeyValue(expect: Expect<T>, key: K, value: V): Assertion =
    ExpectImpl.collector.collect(expect) {
        ExpectImpl.map.entry.key(this).addToInitial { toBe(key) }
        ExpectImpl.map.entry.value(this).addToInitial { toBe(value) }
    }

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun <K, T : Map.Entry<K, *>> _key(expect: Expect<T>): ExtractedFeaturePostStep<T, K> =
    ExpectImpl.feature.property(expect, Map.Entry<K, *>::key)

@Suppress("DeprecatedCallableAddReplaceWith")
@Deprecated("use the function from atrium-logic instead, will be removed with 1.0.0")
fun <V, T : Map.Entry<*, V>> _value(expect: Expect<T>): ExtractedFeaturePostStep<T, V> =
    ExpectImpl.feature.property(expect, Map.Entry<*, V>::value)


