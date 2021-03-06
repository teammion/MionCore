/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package teammion.mioncore.api;

/**
 * Created on 05.11.16 at 11:58
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class MionCoreAPI
{
    public static final String VERSION = "1.2.1";
    
    public static IMionCore getMionCore()
    {
        IMionCore ret = null;
        
        try
        {
            ret = (IMionCore) Class.forName("teammion.mioncore.MionCore").getField("instance").get(null);
        }
        catch (IllegalAccessException | NoSuchFieldException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        
        if (ret == null)
            throw new RuntimeException("MionCore not yet initialized!");
        
        return ret;
    }
}
