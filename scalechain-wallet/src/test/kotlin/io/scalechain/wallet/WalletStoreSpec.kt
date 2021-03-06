package io.scalechain.wallet

import io.kotlintest.KTestJUnitRunner
import java.io.File

import io.scalechain.blockchain.storage.Storage
import org.junit.runner.RunWith
import java.util.*


@RunWith(KTestJUnitRunner::class)
class WalletStoreSpec : WalletTestTrait(), WalletTests {

  override val testPath = File("./build/unittests-WalletStoreSpec-${Random().nextLong()}")

  lateinit override var store : WalletStore

  init {
    if (!Storage.isInitialized)
      Storage.initialize()

    addTests()
  }

  override fun beforeEach() {
    super.beforeEach()

    store = WalletStore()
  }

  override fun afterEach() {
    super.afterEach()
  }
}
