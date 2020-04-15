package ch.tutteli.atrium.specs.reporting

import ch.tutteli.atrium.assertions.BulletPointIdentifier
import ch.tutteli.atrium.assertions.WarningAssertionGroupType
import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.reporting.AssertionFormatter
import ch.tutteli.atrium.reporting.AssertionFormatterController
import kotlin.reflect.KClass

abstract class TextWarningAssertionGroupFormatterSpec(
    testeeFactory: (Map<KClass<out BulletPointIdentifier>, String>, AssertionFormatterController) -> AssertionFormatter,
    describePrefix: String = "[Atrium] "
) : TextExplanatoryBasedAssertionGroupFormatterSpec<WarningAssertionGroupType>(
    testeeFactory,
    WarningAssertionGroupType::class,
    WarningAssertionGroupType,
    { ExpectImpl.builder.explanatoryGroup.withWarningType.withAssertions(it).build() },
    describePrefix
)