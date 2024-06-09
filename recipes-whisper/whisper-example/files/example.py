import whisper

model_path = '/usr/share/whisper/tiny.pt'
model = whisper.load_model(model_path)


res = model.transcribe("audio.wav")

print(res['text'])
