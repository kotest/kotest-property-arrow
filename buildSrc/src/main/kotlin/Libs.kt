object Libs {

   const val kotlinVersion = "1.4.32"
   const val org = "io.kotest.extensions"

   object Kotest {
      private const val version = "4.4.3"
      const val junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
      const val Property = "io.kotest:kotest-property:$version"
   }

   object Arrow {
      private const val version = "0.13.1"
      const val core = "io.arrow-kt:arrow-core:$version"
   }

   object Coroutines {
      private const val version = "1.4.3"
      const val coreCommon = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
      const val coreJvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$version"
   }
}
