/*************************************************************************************
 * Copyright (C) 2014-2016 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/

package com.generalbytes.batm.server.extensions;

/**
 * Classes implementing this interface represent crypto paper wallet generated by IPaperWalletGenerator
 * @see com.generalbytes.batm.server.extensions.IPaperWalletGenerator
 */
public interface IPaperWallet {
    /**
     * Raw bytes that will be contained in file attached in email sent to customer.
     * @return
     */
    public byte[] getContent();

    /**
     * Public crypto address. This address is later used in log files and also as part of attachment filename
     * @return
     */
    public String getAddress();

    /**
     * Returns private key - used when printing paper wallet
     * @return
     */
    public String getPrivateKey();
    /**
     * Attachment extension (ie "zip")
     * @return
     */
    public String getFileExtension();

    /**
     * MIME Content type of the attachment (ie "application/zip")
     * @return
     */
    public String getContentType();

    /**
     * Returns message that will be in email's body (ie instructions what to do with the attachment - how to import private key to your wallet)
     * @return
     */
    public String getMessage();


    /**
     * Returns cryptocurrency for which the wallet was generated
     * @return
     */
    public String getCryptoCurrency();
}
