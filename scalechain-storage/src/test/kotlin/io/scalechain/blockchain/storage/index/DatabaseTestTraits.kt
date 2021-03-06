package io.scalechain.blockchain.storage.index

/**
 * Created by kangmo on 15/12/2016.
 */
interface DatabaseTestTraits : KeyValueDatabaseTestTrait, KeyValueDatabaseMultithreadTestTrait, KeyValueSeekTestTrait, KeyValuePrefixedSeekTestTrait, TransactionDescriptorIndexTestTrait, TransactionPoolIndexTestTrait, TransactionTimeIndexTestTrait{
  override fun addTests() {
    super<KeyValueDatabaseTestTrait>.addTests()
    super<KeyValueDatabaseMultithreadTestTrait>.addTests()
    super<KeyValueSeekTestTrait>.addTests()
    super<KeyValuePrefixedSeekTestTrait>.addTests()
    super<TransactionDescriptorIndexTestTrait>.addTests()
    super<TransactionPoolIndexTestTrait>.addTests()
    super<TransactionTimeIndexTestTrait>.addTests()
  }
}