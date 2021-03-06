/*
 * MIT License
 *
 * Copyright (c) [2018] [Mark Tripoli (Triippz)]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.triippztech.utils;

import org.stellar.sdk.Network;
import org.stellar.sdk.Server;

import java.util.Objects;

import static com.triippztech.utils.Props.*;


public class Connections
{
    public static Server getServer ( boolean isMainNet )
    {
        Server server;
        if ( isMainNet )
        {
            /* Connect to the mainnet */
            Network.usePublicNetwork();
            server = new Server ( Objects.requireNonNull ( Props.getProperty ( LUNAR_HELPER_PROPS, MAIN_NET ) ) );
        } else {
            /* Connect to the testnet */
            Network.useTestNetwork();
            server = new Server ( Objects.requireNonNull ( Props.getProperty ( LUNAR_HELPER_PROPS, TEST_NET ) ) );
        }

        return server;
    }
}
