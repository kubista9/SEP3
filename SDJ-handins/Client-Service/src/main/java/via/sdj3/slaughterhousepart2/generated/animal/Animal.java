// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: animal.proto

package via.sdj3.slaughterhousepart2.generated.animal;

public final class Animal {
  private Animal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalObj_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalObj_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014animal.proto\"!\n\013RequestText\022\022\n\ninput_t" +
      "ext\030\001 \001(\005\"#\n\014ResponseText\022\023\n\013output_text" +
      "\030\001 \001(\t\"S\n\tAnimalObj\022\n\n\002id\030\001 \001(\005\022\014\n\004date\030" +
      "\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\016\n\006origin\030\004 \001(\t\022\016\n\006w" +
      "eight\030\005 \001(\0012c\n\rAnimalService\022%\n\taddAnima" +
      "l\022\n.AnimalObj\032\n.AnimalObj\"\000\022+\n\rgetAnimal" +
      "ById\022\014.RequestText\032\n.AnimalObj\"\000B1\n-via." +
      "sdj3.slaughterhousepart2.generated.anima" +
      "lP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestText_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestText_descriptor,
        new java.lang.String[] { "InputText", });
    internal_static_ResponseText_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResponseText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseText_descriptor,
        new java.lang.String[] { "OutputText", });
    internal_static_AnimalObj_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AnimalObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalObj_descriptor,
        new java.lang.String[] { "Id", "Date", "Name", "Origin", "Weight", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}