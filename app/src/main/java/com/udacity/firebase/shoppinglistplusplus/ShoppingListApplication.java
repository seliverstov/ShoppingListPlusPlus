package com.udacity.firebase.shoppinglistplusplus;

import com.firebase.client.Firebase;

/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
<<<<<<< HEAD
=======
        /* Initialize Firebase */
>>>>>>> 2.00_version_0.2_start_code
        Firebase.setAndroidContext(this);
    }

}