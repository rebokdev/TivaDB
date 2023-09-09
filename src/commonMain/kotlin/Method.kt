import kotlinx.serialization.Serializable
import kotlin.reflect.KClass

data class Method(
    val name: String,
    val arguments: Map<String, @Serializable KClass<*>>,
    val returns: @Serializable KClass<*> = Unit::class,
    val code: () -> Unit
)
