package com.navr.patterns.structural.facade;

import java.io.File;

/**
 * This is a facade class to hide the framework's complexity
 * behind a simple interface. It's a trade-off between
 * functionality and simplicity.
 *<br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/facade">Facade design pattern</a>
 *
 */
public class VideoConverter {

    public File convertVideo(String fileName, String format) {
        VideoFile file = new VideoFile(fileName);
//        sourceCodec = (new CodecFactory).extract(file);
//        if (format == "mp4") {
//            destinationCodec = new MPEG4CompressionCodec();
//        } else {
//            destinationCodec = new OggCompressionCodec();
//        }
//        buffer = BitrateReader.read(filename, sourceCodec);
//        result = BitrateReader.convert(buffer, destinationCodec);
//        result = (new AudioMixer()).fix(result);
        return new File("some_result");
    }
}
