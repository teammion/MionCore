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

package teammion.mioncore;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import teammion.mioncore.api.IMionCore;
import teammion.mioncore.api.util.IItem;

/**
 * This is just the Mod class for Forge to recognize this as a mod.
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
@Mod(modid = "mioncore")
public class MionCore implements IMionCore
{
    @Mod.Instance
    public static MionCore instance;
    
    public MionCore()
    {
        FMLLog.log("mioncore", Level.INFO, "MionCore enabled");
    }
    
    @SideOnly(Side.CLIENT)
    public void registerModel(IItem item, int meta, ModelResourceLocation modelResourceLocation)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item.item(), meta, modelResourceLocation);
    }
}
