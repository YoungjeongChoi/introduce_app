package com.example.signin

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey

class AccountData(private val dataStore: DataStore<Preferences>) {
    companion object{

        val USER_NAME = stringPreferencesKey("User_Name")
        val USER_ID = stringPreferencesKey("User_Id")
        val USER_PW = stringPreferencesKey("User_Pw")

    }

    suspend fun storeData(name: String, id: String, pw: String) {
        dataStore.edit {
            it[USER_NAME] = name
            it[USER_ID] = id
            it[USER_PW] = pw
        }
    }



}