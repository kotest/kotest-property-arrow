object Libs {

   const val kotlinVersion = "1.4.32"
   const val org = "io.kotest.extensions"

   object Kotest {
      private const val version = "4.5.0"
      const val Property = "io.kotest:kotest-property:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
   }

   object Arrow {
      private const val version = "0.13.2"
      const val core = "io.arrow-kt:arrow-core:$version"
   }
}
